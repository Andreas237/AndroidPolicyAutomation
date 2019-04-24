.class Lo/etr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etr;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/etr;


# direct methods
.method constructor <init>(Lo/etr;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/etr$3;->a:Lo/etr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 5

    .line 47
    const/16 v0, 0x66

    if-ne p1, v0, :cond_0

    .line 48
    const-string v0, "UIHLH_SubscribeUserPrefUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PREFERENCE_INFO onChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lo/etr$3;->a:Lo/etr;

    invoke-static {v0}, Lo/etr;->b(Lo/etr;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 50
    iget-object v0, p0, Lo/etr$3;->a:Lo/etr;

    invoke-static {v0}, Lo/etr;->b(Lo/etr;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 51
    const/4 v0, 0x6

    iput v0, v4, Landroid/os/Message;->what:I

    .line 52
    iget-object v0, p0, Lo/etr$3;->a:Lo/etr;

    invoke-static {v0}, Lo/etr;->b(Lo/etr;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 55
    :cond_0
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 43
    return-void
.end method
