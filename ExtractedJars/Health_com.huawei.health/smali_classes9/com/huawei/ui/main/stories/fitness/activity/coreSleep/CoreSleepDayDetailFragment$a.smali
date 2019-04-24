.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V
    .locals 1

    .line 954
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 955
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$a;->c:Ljava/lang/ref/WeakReference;

    .line 956
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 11

    .line 960
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    .line 961
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 962
    return-void

    .line 965
    :cond_0
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestDatas requestSleepDetailUIData xxxx onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 966
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 967
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestDatas requestSleepDetailUIData xxxx onResponse sucess objData != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestDatas requestSleepDetailUIData xxxx onResponse sucess objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 970
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->l()I

    move-result v5

    .line 971
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->o()I

    move-result v6

    .line 972
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->p()I

    move-result v7

    .line 973
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->n()I

    move-result v8

    .line 974
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->Q()Z

    move-result v9

    .line 976
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isCoreSleep = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    const-string v0, "CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rem = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",deepSleepTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",lightSleepTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 978
    if-lez v6, :cond_2

    if-nez v5, :cond_2

    if-nez v7, :cond_2

    if-eqz v9, :cond_2

    .line 979
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;Z)Z

    .line 980
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1774

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    .line 982
    :cond_2
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse,mCurrentDay="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->b:Ljava/util/Date;

    invoke-static {v3}, Lo/dbu;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 983
    if-eqz v9, :cond_4

    .line 984
    add-int v0, v8, v5

    add-int/2addr v0, v6

    add-int v10, v0, v7

    .line 985
    if-ne v8, v10, :cond_3

    if-eqz v8, :cond_3

    .line 986
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is noonsleep"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->b:Ljava/util/Date;

    invoke-static {v3}, Lo/dbu;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 987
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;Z)Z

    .line 988
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 990
    :cond_3
    iget-object v0, v4, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->b:Ljava/util/Date;

    const/4 v1, 0x7

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;Ljava/util/Date;I)V

    .line 992
    :goto_0
    goto :goto_1

    .line 993
    :cond_4
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;Z)Z

    .line 994
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1776

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 995
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1777

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 999
    :goto_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1775

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1000
    return-void
.end method
