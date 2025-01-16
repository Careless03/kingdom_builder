<!-- I wrote all of this myself then plugged it into chatGPT in order to get it formatted nice and quick.
Here is the link to my conversation: https://chatgpt.com/share/6787c5b8-0fb0-800f-853f-19725daf03e4

 -->

<!DOCTYPE html><html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Game Overview</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f4f4f4;
        }
        .grid {
            display: grid;
            grid-template-columns: repeat(10, 1fr);
            gap: 0px ;
            margin: 10px auto;
            width: 300px; /*This is dependent on .sq width/height * 10 */
        }
        .sq {
            width: 30px;
            height: 30px;
            border: 1px solid #ddd;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 10px;
        }
        .mtn {
            background-color: gray;
        }
        .fst {
            background-color: green;
        }
        .pln {
            background-color: wheat;
        }
        .player1, .player2, .player3, .player4 {
            font-weight: bold;
            color: white;
            text-align: center;
        }
        .player1 { background-color: red; }
        .player2 { background-color: blue; }
        .player3 { background-color: yellow; color: black; }
        .player4 { background-color: purple; }
    </style>
</head>
<body>

<!-- <h1>Equipment</h1> -->
<h1>Overview</h1>
<p><strong>Objective:</strong> Your objective is to select one of the kingdoms. From there, you will go and attempt to conquer the rest of the map.</p>

<p>A square 20 by 20 grid filled with hidden squares of three types—impassable terrain that you cannot enter, Plains that can be explored and built upon, and vast forest available to harvest or cultivate. Four players each begin in one corner, controlling a single unit and initially having 1 action (with more earned by owning cities).</p>

<p>On your turn, you’ll spend actions and/or wood to conquer adjacent squares, both claimed and unclaimed. Once conquered you can either develop your territory by building cities or harvesting the forest of the land. Cities increase the amount of actions you can take on your turn. Wood from cultivating your forest are utilized to take larger and more complex action.</p>

<p>Your goal is to use these resources efficiently—either by outlasting opponents, controlling a majority of cities, cultivating the most resources before the 30 turn limit runs out—to become the ultimate ruler of the grid.</p>

<h1>Rules of the Game</h1>
<h3>Type of Terrain</h3>
<table>
    <thead>
        <tr>
            <th>Terrain</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Mountain</td>
            <td>Impassable Terrain. These squares are unconquerable or passable by players.</td>
        </tr>
        <tr>
            <td>Forest</td>
            <td>Resource Terrain. These squares can be harvested for wood. You can tear it down and make it a pln Terrain for 3 wood, or you can harvest for 1 wood, leaving it as fst Terrain.</td>
        </tr>
        <tr>
            <td>Plains</td>
            <td>Open Terrain. These squares are empty and provide no benefit. However, a city can only be built on Plains Terrain. Once a city is built, it grants an additional action per turn.</td>
        </tr>
    </tbody>
</table>

<h3>Available Actions</h3>
<table>
    <thead>
        <tr>
            <th>Action</th>
            <th>Description</th>
            <th>Action Cost</th>
            <th>Resource Cost</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Claim</td>
            <td>Claim a grid square that is touching your territory.</td>
            <td>1 Action</td>
            <td>0 Wood</td>
        </tr>
        <tr>
            <td>Harvest</td>
            <td>Harvest a fst Terrain, converting it to a pln Terrain and gaining lots of wood.</td>
            <td>1 Action</td>
            <td>-3 Wood</td>
        </tr>
        <tr>
            <td>Cultivate</td>
            <td>Cultivate a fst Terrain and gain a small amount of wood.</td>
            <td>1 Action</td>
            <td>-1 Wood</td>
        </tr>
        <tr>
            <td>Build</td>
            <td>Build a city on Plains Terrain. Grants the ability to conduct another action.</td>
            <td>1 Action</td>
            <td>3 Wood</td>
        </tr>
        <tr>
            <td>Attack</td>
            <td>Take a piece of territory not belonging to you.</td>
            <td>1 Action</td>
            <td>1 Wood</td>
        </tr>
        <tr>
            <td>Destroy</td>
            <td>Destroy a city touching or in your territory.</td>
            <td>2 Actions</td>
            <td>2 Wood</td>
        </tr>
    </tbody>
</table>
<h1>Game Grid</h1>
    <div class="grid">
         <!-- Example 10x10 grid with sample starting positions -->
    <div class="player1 sq">P1</div>
    <div class="pln sq"></div>
    <div class="pln sq"></div>
    <div class="pln sq"></div>
    <div class="pln sq"></div>
    <div class="pln sq"></div>
    <div class="pln sq"></div>
    <div class="pln sq"></div>
    <div class="pln sq"></div>
    <div class="player2 sq">P2</div>
    <!-- row 2 -->
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <!-- row 3 -->
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <!-- row 4 -->
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <!-- row 5 -->
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <!-- row 6 -->
    <div class="fst sq"></div>
    <div class="mtn sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="pln sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <!-- row 7 -->
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <!-- row 8 -->
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="pln sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <!-- row 9 -->
    <div class="pln sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="pln sq"></div>
    <div class="fst sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <!-- row 10 -->
    <div class="player3 sq">P3</div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="fst sq"></div>
    <div class="pln sq"></div>
    <div class="mtn sq"></div>
    <div class="mtn sq"></div>
    <div class="player4 sq">P4</div>
    </div>
</body>
</html>


