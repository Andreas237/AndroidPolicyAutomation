.class Lo/abp$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lo/abp;


# direct methods
.method private constructor <init>(Lo/abp;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lo/abp$a;->c:Lo/abp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/abp;Lo/abp$1;)V
    .locals 0

    .line 181
    invoke-direct {p0, p1}, Lo/abp$a;-><init>(Lo/abp;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 185
    iget-object v0, p0, Lo/abp$a;->c:Lo/abp;

    invoke-static {p2}, Lo/akm$b;->b(Landroid/os/IBinder;)Lo/akm;

    move-result-object v1

    invoke-static {v0, v1}, Lo/abp;->b(Lo/abp;Lo/akm;)Lo/akm;

    .line 187
    iget-object v0, p0, Lo/abp$a;->c:Lo/abp;

    invoke-virtual {v0}, Lo/abp;->c()Ljava/lang/String;

    move-result-object v4

    .line 188
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyServiceConn connect "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lo/abp$a;->c:Lo/abp;

    invoke-static {v0}, Lo/abp;->e(Lo/abp;)Lo/ala;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 193
    if-eqz v4, :cond_0

    .line 194
    iget-object v0, p0, Lo/abp$a;->c:Lo/abp;

    invoke-static {v0}, Lo/abp;->e(Lo/abp;)Lo/ala;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ala;->b(Landroid/os/Bundle;)V

    goto :goto_0

    .line 196
    :cond_0
    iget-object v0, p0, Lo/abp$a;->c:Lo/abp;

    invoke-static {v0}, Lo/abp;->e(Lo/abp;)Lo/ala;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ala;->a(Landroid/os/Bundle;)V

    .line 199
    :cond_1
    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 204
    return-void
.end method
