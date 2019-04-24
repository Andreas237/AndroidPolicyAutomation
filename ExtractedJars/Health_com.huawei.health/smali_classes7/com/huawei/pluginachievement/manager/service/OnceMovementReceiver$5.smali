.class Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

.field final synthetic c:Lcom/huawei/pluginachievement/manager/model/TrackData;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;Lcom/huawei/pluginachievement/manager/model/TrackData;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver$5;->a:Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    iput-object p2, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver$5;->c:Lcom/huawei/pluginachievement/manager/model/TrackData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver$5;->a:Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    iget-object v1, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver$5;->c:Lcom/huawei/pluginachievement/manager/model/TrackData;

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->b(Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;Lcom/huawei/pluginachievement/manager/model/TrackData;)V

    .line 144
    return-void
.end method
