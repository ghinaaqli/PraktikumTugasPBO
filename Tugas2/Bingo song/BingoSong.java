class BingoSong {
    private static final String[] lyrics = {
        "There was a farmer who had a dog,",
        "And Bingo was his name-o.",
        "B-I-N-G-O",
        "B-I-N-G-O",
        "B-I-N-G-O",
        "And Bingo was his name-o.",
        "There was a farmer who had a dog,",
        "And Bingo was his name-o.",
        "(clap)-I-N-G-O",
        "(clap)-I-N-G-O",
        "(clap)-I-N-G-O",
        "And Bingo was his name-o.",
        "There was a farmer who had a dog,",
        "And Bingo was his name-o.",
        "(clap)-(clap)-N-G-O",
        "(clap)-(clap)-N-G-O",
        "(clap)-(clap)-N-G-O",
        "And Bingo was his name-o.",
        "There was a farmer who had a dog,",
        "And Bingo was his name-o.",
        "(clap)-(clap)-(clap)-G-O",
        "(clap)-(clap)-(clap)-G-O",
        "(clap)-(clap)-(clap)-G-O",
        "And Bingo was his name-o.",
        "There was a farmer who had a dog,",
        "And Bingo was his name-o.",
        "(clap)-(clap)-(clap)-(clap)-O",
        "(clap)-(clap)-(clap)-(clap)-O",
        "(clap)-(clap)-(clap)-(clap)-O",
        "And Bingo was his name-o.",
        "There was a farmer who had a dog,",
        "And Bingo was his name-o.",
        "(clap)-(clap)-(clap)-(clap)-(clap)",
        "(clap)-(clap)-(clap)-(clap)-(clap)",
        "(clap)-(clap)-(clap)-(clap)-(clap)",
        "And Bingo was his name-o."
    };

    public BingoSong() {
        for (String line : lyrics) {
            if (line.startsWith("(clap)")) {
                System.out.println("clap-clap-clap-clap-clap");
            } else {
                System.out.println(line);
            }
        }
    }
}