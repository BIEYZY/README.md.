README  
Design and Evaluation of a Scalable Distributed System with Process Management, Naming, and Data Consistency Mechanisms

Step 1: Download and Extract the Code
1. Download the ZIP file that contains all simulation files
2. Extract the ZIP file to a desired folder on your computer
3. Navigate to the extracted folder where you see all .java files
4. # The standalone files are dedicated to specific tasks, each containing its own detailed implementations.

Step 2: Set up your Java Environment
- Using an IDE (Netbeans/VS Code)
1. Create a new Java project
2. Create a packaged named simulation
3. Copy all Java files into the simulation package
4. Right-click MainSimulation.java > Run > Java Application

Step 3: View and Modify the Code
- MainSimulation.java > Configuration hub(choose naming/consistency models)
- Client.java > Simulates client requests with network delays
- Replica.java > Shared data store with thread-safe operations
- TimeUtil.java > Provides timestamps for event sequencing

Configuration Options
Naming Strategies (choose one in MainSimulation.java):
1. FlatNamingServer
2. StructuredNamingServer
3. AttributedNamingServer

Consistency Models (choose one in MainSimulation.java):
1. sequentialConsistency
2. EventualConsistency
3. ClientCentricConsistency

🛠Troubleshooting⚙
1. "Package simulation does not exist."
- Ensure all files are in a folder named simulation
- Compile from the parent directory, not inside the simulation folder

2. "Class not found" errors
- Make sure you compiled ALL files: javac simulation/*.java
- Check that all filenames match the class names exactly (case-sensitive)

3. No output appears
- The simulation includes deliberate delays (1-6 seconds)
- Wait at least 10 seconds for complete execution
- Check that TimeUtil.java is present and compiled
