.class Lcom/huawei/motiondetection/motionrelay/RelayManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/motiondetection/motionrelay/RelayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/motiondetection/motionrelay/RelayManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/motiondetection/motionrelay/RelayManager;


# direct methods
.method constructor <init>(Lcom/huawei/motiondetection/motionrelay/RelayManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager$1;->this$0:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyResult(ILjava/lang/Object;)V
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayManager$1;->this$0:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    invoke-static {v0, p1, p2}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->access$0(Lcom/huawei/motiondetection/motionrelay/RelayManager;ILjava/lang/Object;)V

    .line 152
    return-void
.end method
