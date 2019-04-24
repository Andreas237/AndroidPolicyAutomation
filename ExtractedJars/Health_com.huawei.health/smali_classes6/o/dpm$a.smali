.class Lo/dpm$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dpm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field c:Ljava/io/InputStream;

.field e:Ljava/io/PrintStream;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Ljava/io/PrintStream;)V
    .locals 0

    .line 198
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 199
    iput-object p1, p0, Lo/dpm$a;->c:Ljava/io/InputStream;

    .line 200
    iput-object p2, p0, Lo/dpm$a;->e:Ljava/io/PrintStream;

    .line 201
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 206
    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/dpm$a;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 207
    iget-object v0, p0, Lo/dpm$a;->e:Ljava/io/PrintStream;

    int-to-char v1, v4

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(C)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 211
    :cond_0
    goto :goto_1

    .line 208
    :catch_0
    move-exception v4

    .line 210
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handle error : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :goto_1
    return-void
.end method
