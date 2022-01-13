




fun main(args: Array<String>) {
    var ox = mutableListOf (mutableListOf("_","_","_"), mutableListOf("_", "_", "_"), mutableListOf("_", "_", "_"))

    var audit = 0
    while((ox[0][0]!= ox[0][1] || ox[0][0]!=ox[0][2] || ox[0][2]=="_")&& (ox[1][0]!= ox[1][1]|| ox[1][0]!=ox[1][2] || ox[1][2]=="_")&& (ox[2][0]!= ox[2][1]|| ox[2][0]!=ox[2][2] || ox[2][2]=="_")&& (ox[0][0]!= ox[1][1]|| ox[0][0]!=ox[2][2] || ox[2][2]=="_")&& (ox[0][2]!= ox[1][1]|| ox[0][2]!=ox[2][0] || ox[2][0]=="_")&& (ox[0][0]!= ox[1][0]|| ox[0][0]!=ox[2][0] || ox[2][0]=="_")&& (ox[0][1]!= ox[1][1]|| ox[0][1]!=ox[2][1] || ox[2][1]=="_")&& (ox[0][2]!= ox[1][2]|| ox[0][2]!=ox[2][2] || ox[2][2]=="_") ){
        var i  = readLine()?.toIntOrNull()
        var j = readLine()?.toIntOrNull()
        if(i == null || j == null || i>3 || j>3 || i<0 || j<0){break}
        if(audit%2==0){
            ox[i][j] = "x"
        } else {
             ox[i][j] = "0"
        }
        audit ++
        for(index in 0..2){
            for(jindex in 0..2){
                print(ox[index][jindex])
                if(jindex == 2){
                    print("\n")
                }

            }

        } }}
