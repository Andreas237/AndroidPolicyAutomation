.class Lo/dkn$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lo/dkn;


# direct methods
.method private constructor <init>(Lo/dkn;)V
    .locals 0

    .line 878
    iput-object p1, p0, Lo/dkn$c;->e:Lo/dkn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dkn;Lo/dkn$2;)V
    .locals 0

    .line 878
    invoke-direct {p0, p1}, Lo/dkn$c;-><init>(Lo/dkn;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 881
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check notification is enable "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 882
    invoke-static {}, Lo/dkn;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->D(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 883
    return-void

    .line 885
    :cond_0
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check notification is disabled "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 886
    iget-object v0, p0, Lo/dkn$c;->e:Lo/dkn;

    invoke-static {}, Lo/dkn;->g()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dkn;->e(Lo/dkn;Landroid/content/Context;)V

    .line 888
    return-void
.end method
