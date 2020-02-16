package ua.lviv.iot.firstLab;

public class PoolCreator {

	public static void main(String[] args) {
		Pool firstPool = new Pool();
        Pool secondPool = new Pool("87 Pasichna Street", 125, 20, 150);
        Pool thirdPool = new Pool("39A Kleparivska Street", 190, 35, 215,"Blue", 3, 2);
        System.out.println();
	
        System.out.println(firstPool);
        System.out.println(secondPool);
        System.out.println(thirdPool);
        System.out.println();
	
        Pool.printStaticField();
        firstPool.printField();
        System.out.println();
	
        int amountObjectsArray = 4;
        Pool[] pools = new Pool[amountObjectsArray];
        for (int iterator = 0; iterator < amountObjectsArray; iterator++) {
            pools[iterator] = new Pool();
        }

        for (Pool pool : pools) {
            System.out.println(pool);
        }
	}

}
