.class public final Lo/awn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/awn$e;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static final b:Ljava/lang/String;

.field private static e:Lo/awn;

.field private static final p:Ljava/lang/Object;


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/awl;>;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/Integer;

.field private f:Ljava/lang/Boolean;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/awn$e;>;"
        }
    .end annotation
.end field

.field private h:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private i:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/awo;>;"
        }
    .end annotation
.end field

.field private o:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 44
    const-class v0, Lo/awn;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/awn;->b:Ljava/lang/String;

    .line 79
    new-instance v0, Lo/awn;

    invoke-direct {v0}, Lo/awn;-><init>()V

    sput-object v0, Lo/awn;->e:Lo/awn;

    .line 114
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/awn;->p:Ljava/lang/Object;

    .line 124
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0xa

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v0, Lo/awn;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/awn;->d:Ljava/lang/Integer;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awn;->c:Ljava/util/List;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awn;->k:Ljava/util/List;

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awn;->g:Ljava/util/List;

    .line 99
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/awn;->h:Landroid/support/v4/util/LongSparseArray;

    .line 104
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/awn;->i:Landroid/support/v4/util/LongSparseArray;

    .line 109
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/awn;->f:Ljava/lang/Boolean;

    .line 119
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/awn;->o:Ljava/lang/Object;

    .line 136
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlPullParser;
    .locals 4

    .line 834
    const/4 v2, 0x0

    .line 837
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lo/awn;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 839
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 841
    const-string v0, "UTF-8"

    invoke-virtual {p3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/bro;->e([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    .line 846
    :cond_0
    const-string v0, "UTF-8"

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/bro;->e([B)Lorg/xmlpull/v1/XmlPullParser;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 856
    :cond_1
    :goto_0
    goto :goto_1

    .line 849
    :catch_0
    move-exception v3

    .line 851
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getPullParser XmlPullParserException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 856
    goto :goto_1

    .line 853
    :catch_1
    move-exception v3

    .line 855
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getPullParser IOException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 857
    :goto_1
    return-object v2
.end method

.method private a(Lo/awl;Lo/awo;Ljava/lang/String;)V
    .locals 1

    .line 806
    const-string v0, "site"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 808
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Lo/awl;->a()I

    move-result v0

    if-lez v0, :cond_1

    .line 810
    iget-object v0, p0, Lo/awn;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 813
    :cond_0
    const-string v0, "country"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 815
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 817
    iget-object v0, p0, Lo/awn;->k:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 820
    :cond_1
    :goto_0
    return-void
.end method

.method private a(I)Z
    .locals 1

    .line 429
    const/4 v0, 0x1

    return v0
.end method

.method private b(Landroid/content/Context;)Ljava/lang/String;
    .locals 13

    .line 576
    const/4 v3, 0x0

    .line 577
    const/4 v4, 0x0

    .line 578
    const/4 v5, 0x0

    .line 579
    const-string v6, ""

    .line 580
    const/4 v7, 0x0

    .line 583
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 584
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "globalSiteCountryList.xml"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 585
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v3, v0

    .line 586
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v5, v0

    .line 587
    const-string v9, ""

    .line 588
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 590
    new-instance v0, Lorg/apache/commons/io/LineIterator;

    invoke-direct {v0, v5}, Lorg/apache/commons/io/LineIterator;-><init>(Ljava/io/Reader;)V

    move-object v7, v0

    .line 591
    :goto_0
    invoke-virtual {v7}, Lorg/apache/commons/io/LineIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 593
    invoke-virtual {v7}, Lorg/apache/commons/io/LineIterator;->next()Ljava/lang/String;

    move-result-object v9

    .line 594
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 597
    :cond_0
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 609
    if-eqz v7, :cond_1

    .line 613
    :try_start_1
    invoke-virtual {v7}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 618
    goto :goto_1

    .line 615
    :catch_0
    move-exception v8

    .line 617
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException iterator close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    :cond_1
    :goto_1
    if-eqz v5, :cond_2

    .line 624
    :try_start_2
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 629
    goto :goto_2

    .line 626
    :catch_1
    move-exception v8

    .line 628
    const-string v0, "TAG"

    const-string v1, "IOException.bufferDataFile close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 632
    :cond_2
    :goto_2
    if-eqz v3, :cond_3

    .line 636
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 641
    goto :goto_3

    .line 638
    :catch_2
    move-exception v8

    .line 640
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    :cond_3
    :goto_3
    if-eqz v4, :cond_e

    .line 648
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 653
    goto/16 :goto_e

    .line 650
    :catch_3
    move-exception v8

    .line 652
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException in close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    goto/16 :goto_e

    .line 599
    :catch_4
    move-exception v8

    .line 601
    :try_start_5
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getFromDataFile FileNotFoundException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 609
    if-eqz v7, :cond_4

    .line 613
    :try_start_6
    invoke-virtual {v7}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 618
    goto :goto_4

    .line 615
    :catch_5
    move-exception v8

    .line 617
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException iterator close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    :cond_4
    :goto_4
    if-eqz v5, :cond_5

    .line 624
    :try_start_7
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 629
    goto :goto_5

    .line 626
    :catch_6
    move-exception v8

    .line 628
    const-string v0, "TAG"

    const-string v1, "IOException.bufferDataFile close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 632
    :cond_5
    :goto_5
    if-eqz v3, :cond_6

    .line 636
    :try_start_8
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 641
    goto :goto_6

    .line 638
    :catch_7
    move-exception v8

    .line 640
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    :cond_6
    :goto_6
    if-eqz v4, :cond_e

    .line 648
    :try_start_9
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 653
    goto/16 :goto_e

    .line 650
    :catch_8
    move-exception v8

    .line 652
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException in close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    goto/16 :goto_e

    .line 603
    :catch_9
    move-exception v8

    .line 605
    :try_start_a
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getFromDataFile UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 609
    if-eqz v7, :cond_7

    .line 613
    :try_start_b
    invoke-virtual {v7}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a

    .line 618
    goto :goto_7

    .line 615
    :catch_a
    move-exception v8

    .line 617
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException iterator close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    :cond_7
    :goto_7
    if-eqz v5, :cond_8

    .line 624
    :try_start_c
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_b

    .line 629
    goto :goto_8

    .line 626
    :catch_b
    move-exception v8

    .line 628
    const-string v0, "TAG"

    const-string v1, "IOException.bufferDataFile close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 632
    :cond_8
    :goto_8
    if-eqz v3, :cond_9

    .line 636
    :try_start_d
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_c

    .line 641
    goto :goto_9

    .line 638
    :catch_c
    move-exception v8

    .line 640
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    :cond_9
    :goto_9
    if-eqz v4, :cond_e

    .line 648
    :try_start_e
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_d

    .line 653
    goto :goto_e

    .line 650
    :catch_d
    move-exception v8

    .line 652
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException in close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    goto :goto_e

    .line 609
    :catchall_0
    move-exception v11

    if-eqz v7, :cond_a

    .line 613
    :try_start_f
    invoke-virtual {v7}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_e

    .line 618
    goto :goto_a

    .line 615
    :catch_e
    move-exception v12

    .line 617
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException iterator close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    :cond_a
    :goto_a
    if-eqz v5, :cond_b

    .line 624
    :try_start_10
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_f

    .line 629
    goto :goto_b

    .line 626
    :catch_f
    move-exception v12

    .line 628
    const-string v0, "TAG"

    const-string v1, "IOException.bufferDataFile close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 632
    :cond_b
    :goto_b
    if-eqz v3, :cond_c

    .line 636
    :try_start_11
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_10

    .line 641
    goto :goto_c

    .line 638
    :catch_10
    move-exception v12

    .line 640
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    :cond_c
    :goto_c
    if-eqz v4, :cond_d

    .line 648
    :try_start_12
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_11

    .line 653
    goto :goto_d

    .line 650
    :catch_11
    move-exception v12

    .line 652
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException in close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    :cond_d
    :goto_d
    throw v11

    .line 656
    :cond_e
    :goto_e
    return-object v6
.end method

.method private b()V
    .locals 11

    .line 226
    iget-object v4, p0, Lo/awn;->o:Ljava/lang/Object;

    monitor-enter v4

    .line 228
    :try_start_0
    iget-object v0, p0, Lo/awn;->f:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 230
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/awn;->f:Ljava/lang/Boolean;

    .line 231
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->e()Ljava/util/ArrayList;

    move-result-object v5

    .line 233
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 235
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 236
    iget-object v0, p0, Lo/awn;->h:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getSiteId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 233
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 239
    :cond_0
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/atc;->e(IZ)Ljava/util/ArrayList;

    move-result-object v7

    .line 241
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 243
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/group/Group;

    .line 244
    iget-object v0, p0, Lo/awn;->i:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/Group;->getSiteID()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 247
    :cond_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 248
    :goto_2
    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 870
    invoke-direct {p0, p1, p2}, Lo/awn;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 871
    invoke-direct {p0, p1, p3}, Lo/awn;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 872
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 874
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "versionDataFile is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 875
    const/4 v0, 0x1

    return v0

    .line 877
    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 879
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "versionAssetsFile is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 880
    const/4 v0, 0x0

    return v0

    .line 886
    :cond_1
    const-string v0, "\\."

    :try_start_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 887
    const-string v0, "\\."

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 889
    const/4 v6, 0x0

    :goto_0
    array-length v0, v4

    if-ge v6, v0, :cond_3

    array-length v0, v5

    if-ge v6, v0, :cond_3

    .line 891
    aget-object v0, v4, v6

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 892
    aget-object v0, v5, v6

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result v8

    .line 893
    if-ge v7, v8, :cond_2

    .line 895
    const/4 v0, 0x1

    return v0

    .line 889
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 910
    :cond_3
    goto :goto_1

    .line 899
    :catch_0
    move-exception v4

    .line 901
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "isVersionDataOutOfDate PatternSyntaxException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 910
    goto :goto_1

    .line 903
    :catch_1
    move-exception v4

    .line 905
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "isVersionDataOutOfDate NumberFormatException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 910
    goto :goto_1

    .line 907
    :catch_2
    move-exception v4

    .line 909
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getStringWithNewVersion Exception"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private c(I)V
    .locals 1

    .line 418
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/awn;->d:Ljava/lang/Integer;

    .line 419
    return-void
.end method

.method private d(Landroid/content/Context;)Ljava/lang/String;
    .locals 11

    .line 667
    const/4 v3, 0x0

    .line 668
    const/4 v4, 0x0

    .line 669
    const-string v5, ""

    .line 670
    const/4 v6, 0x0

    .line 673
    :try_start_0
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "globalSiteCountryList.xml"

    .line 674
    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v3, v0

    .line 675
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v4, v0

    .line 676
    const-string v7, ""

    .line 677
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 679
    new-instance v0, Lorg/apache/commons/io/LineIterator;

    invoke-direct {v0, v4}, Lorg/apache/commons/io/LineIterator;-><init>(Ljava/io/Reader;)V

    move-object v6, v0

    .line 680
    :goto_0
    invoke-virtual {v6}, Lorg/apache/commons/io/LineIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 682
    invoke-virtual {v6}, Lorg/apache/commons/io/LineIterator;->next()Ljava/lang/String;

    move-result-object v7

    .line 683
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 686
    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v5, v0

    .line 698
    if-eqz v6, :cond_1

    .line 702
    :try_start_1
    invoke-virtual {v6}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 707
    goto :goto_1

    .line 704
    :catch_0
    move-exception v7

    .line 706
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "iterator bufferReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    :cond_1
    :goto_1
    if-eqz v4, :cond_2

    .line 713
    :try_start_2
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 718
    goto :goto_2

    .line 715
    :catch_1
    move-exception v7

    .line 717
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException bufferReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 720
    :cond_2
    :goto_2
    if-eqz v3, :cond_a

    .line 724
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 729
    goto/16 :goto_a

    .line 726
    :catch_2
    move-exception v7

    .line 728
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException inputStreamReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    goto/16 :goto_a

    .line 688
    :catch_3
    move-exception v7

    .line 690
    :try_start_4
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getFromAssets UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 698
    if-eqz v6, :cond_3

    .line 702
    :try_start_5
    invoke-virtual {v6}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 707
    goto :goto_3

    .line 704
    :catch_4
    move-exception v7

    .line 706
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "iterator bufferReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    :cond_3
    :goto_3
    if-eqz v4, :cond_4

    .line 713
    :try_start_6
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 718
    goto :goto_4

    .line 715
    :catch_5
    move-exception v7

    .line 717
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException bufferReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 720
    :cond_4
    :goto_4
    if-eqz v3, :cond_a

    .line 724
    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 729
    goto/16 :goto_a

    .line 726
    :catch_6
    move-exception v7

    .line 728
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException inputStreamReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    goto/16 :goto_a

    .line 692
    :catch_7
    move-exception v7

    .line 694
    :try_start_8
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getFromAssets IOException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 698
    if-eqz v6, :cond_5

    .line 702
    :try_start_9
    invoke-virtual {v6}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 707
    goto :goto_5

    .line 704
    :catch_8
    move-exception v7

    .line 706
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "iterator bufferReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    :cond_5
    :goto_5
    if-eqz v4, :cond_6

    .line 713
    :try_start_a
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 718
    goto :goto_6

    .line 715
    :catch_9
    move-exception v7

    .line 717
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException bufferReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 720
    :cond_6
    :goto_6
    if-eqz v3, :cond_a

    .line 724
    :try_start_b
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a

    .line 729
    goto :goto_a

    .line 726
    :catch_a
    move-exception v7

    .line 728
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException inputStreamReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    goto :goto_a

    .line 698
    :catchall_0
    move-exception v9

    if-eqz v6, :cond_7

    .line 702
    :try_start_c
    invoke-virtual {v6}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_b

    .line 707
    goto :goto_7

    .line 704
    :catch_b
    move-exception v10

    .line 706
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "iterator bufferReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    :cond_7
    :goto_7
    if-eqz v4, :cond_8

    .line 713
    :try_start_d
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_c

    .line 718
    goto :goto_8

    .line 715
    :catch_c
    move-exception v10

    .line 717
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException bufferReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 720
    :cond_8
    :goto_8
    if-eqz v3, :cond_9

    .line 724
    :try_start_e
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_d

    .line 729
    goto :goto_9

    .line 726
    :catch_d
    move-exception v10

    .line 728
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "IOException inputStreamReader close"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    :cond_9
    :goto_9
    throw v9

    .line 733
    :cond_a
    :goto_a
    return-object v5
.end method

.method private d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 925
    if-eqz p1, :cond_3

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 929
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/bro;->e([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 931
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    :goto_0
    const/4 v0, 0x1

    if-eq v0, v3, :cond_2

    .line 933
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 934
    const/4 v0, 0x2

    if-ne v0, v3, :cond_1

    const-string v0, "Infos"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 936
    const/4 v5, 0x0

    :goto_1
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 938
    const-string v0, "version"

    invoke-interface {v2, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 940
    invoke-interface {v2, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    return-object v0

    .line 936
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 931
    :cond_1
    :try_start_1
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3

    move-result v3

    goto :goto_0

    .line 961
    :cond_2
    goto :goto_2

    .line 946
    :catch_0
    move-exception v2

    .line 948
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getSiteCountryXMLVersion UnsupportedEncodingException "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 961
    goto :goto_2

    .line 950
    :catch_1
    move-exception v2

    .line 952
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getSiteCountryXMLVersion IOException "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 961
    goto :goto_2

    .line 954
    :catch_2
    move-exception v2

    .line 956
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getSiteCountryXMLVersion XmlPullParserException "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 961
    goto :goto_2

    .line 958
    :catch_3
    move-exception v2

    .line 960
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getSiteCountryXMLVersion Exception."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 963
    :goto_2
    const-string v0, ""

    return-object v0

    .line 967
    :cond_3
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "parseSiteCountryXML context or xml is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 968
    const-string v0, ""

    return-object v0
.end method

.method public static e()Lo/awn;
    .locals 1

    .line 153
    sget-object v0, Lo/awn;->e:Lo/awn;

    return-object v0
.end method

.method private e(Landroid/content/Context;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 745
    const/4 v1, 0x0

    .line 746
    const/4 v2, 0x0

    .line 747
    invoke-direct {p0, p1}, Lo/awn;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 748
    invoke-direct {p0, p1}, Lo/awn;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 749
    const/4 v5, 0x0

    .line 750
    invoke-direct {p0, p1, v3, v4}, Lo/awn;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v5

    .line 752
    if-nez v5, :cond_0

    .line 754
    return-void

    .line 756
    :cond_0
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v6

    :goto_0
    const/4 v0, 0x1

    if-eq v0, v6, :cond_3

    .line 759
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    .line 761
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    .line 765
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awn;->c:Ljava/util/List;

    .line 766
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awn;->k:Ljava/util/List;

    .line 767
    goto :goto_1

    .line 771
    :pswitch_1
    const/4 v1, 0x0

    .line 772
    const/4 v2, 0x0

    .line 773
    const-string v0, "site"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 775
    new-instance v1, Lo/awl;

    invoke-direct {v1}, Lo/awl;-><init>()V

    .line 776
    invoke-virtual {v1, v5, v7}, Lo/awl;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)V

    goto :goto_1

    .line 778
    :cond_1
    const-string v0, "country"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 780
    new-instance v2, Lo/awo;

    invoke-direct {v2}, Lo/awo;-><init>()V

    .line 781
    invoke-virtual {v2, v5, v7}, Lo/awo;->d(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)V

    goto :goto_1

    .line 787
    :pswitch_2
    invoke-direct {p0, v1, v2, v7}, Lo/awn;->a(Lo/awl;Lo/awo;Ljava/lang/String;)V

    .line 756
    .line 757
    .line 788
    :cond_2
    :goto_1
    :pswitch_3
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v6

    goto/16 :goto_0

    .line 796
    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private i()V
    .locals 5

    .line 367
    sget-object v2, Lo/awn;->p:Ljava/lang/Object;

    monitor-enter v2

    .line 371
    :try_start_0
    iget-object v0, p0, Lo/awn;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 373
    monitor-exit v2

    return-void

    .line 375
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    invoke-direct {p0, v0}, Lo/awn;->c(I)V

    .line 376
    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v3

    .line 377
    if-nez v3, :cond_1

    .line 379
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "execute():context is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/awn;->c(I)V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 381
    monitor-exit v2

    return-void

    .line 383
    :cond_1
    :try_start_2
    invoke-direct {p0, v3}, Lo/awn;->e(Landroid/content/Context;)V

    .line 384
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/awn;->c(I)V
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 395
    goto :goto_0

    .line 386
    :catch_0
    move-exception v3

    .line 388
    :try_start_3
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getFromDataFile XmlPullParserException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/awn;->c(I)V

    .line 395
    goto :goto_0

    .line 391
    :catch_1
    move-exception v3

    .line 393
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "getFromDataFile IOException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/awn;->c(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 396
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 397
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 331
    invoke-direct {p0}, Lo/awn;->i()V

    .line 332
    return-void
.end method

.method public c(JI)I
    .locals 4

    .line 187
    const/4 v2, 0x1

    .line 189
    invoke-direct {p0}, Lo/awn;->b()V

    .line 191
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 193
    iget-object v0, p0, Lo/awn;->h:Landroid/support/v4/util/LongSparseArray;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/util/LongSparseArray;->get(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 194
    if-nez v2, :cond_2

    .line 196
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 197
    if-eqz v3, :cond_0

    .line 199
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getSiteId()I

    move-result v2

    .line 200
    iget-object v0, p0, Lo/awn;->h:Landroid/support/v4/util/LongSparseArray;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 202
    :cond_0
    goto :goto_0

    .line 204
    :cond_1
    const/4 v0, 0x2

    if-ne p3, v0, :cond_2

    .line 206
    iget-object v0, p0, Lo/awn;->i:Landroid/support/v4/util/LongSparseArray;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/util/LongSparseArray;->get(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 207
    if-nez v2, :cond_2

    .line 209
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 210
    if-eqz v3, :cond_2

    .line 212
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getSiteID()I

    move-result v2

    .line 213
    iget-object v0, p0, Lo/awn;->i:Landroid/support/v4/util/LongSparseArray;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 218
    :cond_2
    :goto_0
    return v2
.end method

.method public c()V
    .locals 5

    .line 161
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    const-string v1, "clearCache"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    sget-object v2, Lo/awn;->p:Ljava/lang/Object;

    monitor-enter v2

    .line 164
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lo/awn;->c(I)V

    .line 165
    iget-object v0, p0, Lo/awn;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 166
    iget-object v0, p0, Lo/awn;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 168
    :goto_0
    iget-object v0, p0, Lo/awn;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 169
    iget-object v2, p0, Lo/awn;->o:Ljava/lang/Object;

    monitor-enter v2

    .line 171
    const/4 v0, 0x0

    :try_start_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/awn;->f:Ljava/lang/Boolean;

    .line 172
    iget-object v0, p0, Lo/awn;->h:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->clear()V

    .line 173
    iget-object v0, p0, Lo/awn;->i:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v4

    monitor-exit v2

    throw v4

    .line 175
    :goto_1
    return-void
.end method

.method public c(ILo/awn$e;)V
    .locals 3

    .line 257
    sget-object v0, Lo/awn;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkSNSAvailable siteID."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    return-void
.end method

.method public d()V
    .locals 0

    .line 339
    invoke-virtual {p0}, Lo/awn;->a()V

    .line 340
    invoke-direct {p0}, Lo/awn;->b()V

    .line 341
    return-void
.end method

.method public d(I)Z
    .locals 1

    .line 310
    invoke-direct {p0, p1}, Lo/awn;->a(I)Z

    move-result v0

    return v0
.end method
