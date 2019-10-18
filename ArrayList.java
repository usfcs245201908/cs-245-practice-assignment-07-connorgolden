public class ArrayList<S> implements List{

    private int DEF_SIZE = 10;
    private int index;
    private Object data[];

    public ArrayList(){
        index = 0;
        data = new Object[DEF_SIZE];
    }


    @Override
    public void add(Object item) {
        if(index == DEF_SIZE - 1){
            DEF_SIZE=DEF_SIZE*2;
            Object[] newData =new Object[DEF_SIZE];
            for(int i=0; i<data.length;i++){
                newData[i]=data[i];
            }
            data=newData;
        }
        data[index]=item;
        index++;
    }

    @Override
    public void add(int pos, Object item) {
        if(pos == DEF_SIZE - 1){
            DEF_SIZE = DEF_SIZE*2;
            Object[] newData =new Object[DEF_SIZE];
            for(int i=0; i<data.length;i++){
                newData[i]=data[i];
            }
            data=newData;
        }
        data[pos]=item;
        index++;
    }

    @Override
    public Object get(int pos) {
        if(pos>index-1){
            return null;
        }
        if(pos<0){
            return null;
        }
        return data[pos];
    }

    @Override
    public Object remove(int pos) {
        if(pos>index-1){
            return null;
        }
        if(pos<0){
           return null;
        }

        Object[] temp = new Object[1];
        temp[0] = data[pos];

        for(int i=pos; i<data.length-1;i++){
            data[i]=data[i+1];
        }
        index--;

        return temp[0];
    }

    @Override
    public int size() {
        return index;
    }
}
