.class Lo/aic$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lo/aic;


# direct methods
.method private constructor <init>(Lo/aic;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/aic$b;->c:Lo/aic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/aic;Lo/aic$3;)V
    .locals 0

    .line 138
    invoke-direct {p0, p1}, Lo/aic$b;-><init>(Lo/aic;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 142
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v0

    iget-object v1, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v1}, Lo/aic;->c(Lo/aic;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/akf;->a(Landroid/content/Context;)I

    move-result v1

    iput v1, v0, Lo/aie;->b:I

    .line 143
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v0

    invoke-static {}, Lo/akc;->e()I

    move-result v1

    iput v1, v0, Lo/aie;->e:I

    .line 144
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, Lo/akc;->b(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aie;->a:Ljava/lang/String;

    .line 145
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v0

    invoke-static {}, Lo/akc;->d()[B

    move-result-object v1

    iput-object v1, v0, Lo/aie;->k:[B

    .line 146
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v0

    invoke-static {}, Lo/akc;->b()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aie;->f:Ljava/lang/String;

    .line 148
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->i(Lo/aic;)V

    .line 150
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v0

    iget-object v1, p0, Lo/aic$b;->c:Lo/aic;

    iget-object v2, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v2}, Lo/aic;->k(Lo/aic;)[B

    move-result-object v2

    invoke-static {v1, v2}, Lo/aic;->a(Lo/aic;[B)[B

    move-result-object v1

    iput-object v1, v0, Lo/aie;->i:[B

    .line 153
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->f(Lo/aic;)V

    .line 155
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->h(Lo/aic;)V

    .line 156
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, ": multicastInfo : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v2}, Lo/aic;->d(Lo/aic;)Lo/aie;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 157
    iget-object v0, p0, Lo/aic$b;->c:Lo/aic;

    invoke-static {v0}, Lo/aic;->g(Lo/aic;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 158
    return-void
.end method
