.class Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity$3;->e:Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 5

    .line 59
    const-string v0, "FreeIndoorRunningActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " mFreeIndoorRunningSwitchButton isChedked is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 62
    if-eqz p2, :cond_0

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity$3;->e:Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->a(Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ihealthlabs"

    const-string v3, "true"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity$3;->e:Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->a(Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ihealthlabs"

    const-string v3, "false"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 70
    :goto_0
    return-void
.end method
