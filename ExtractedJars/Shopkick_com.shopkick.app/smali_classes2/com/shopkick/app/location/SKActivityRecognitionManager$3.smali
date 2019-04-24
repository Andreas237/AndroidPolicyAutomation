.class Lcom/shopkick/app/location/SKActivityRecognitionManager$3;
.super Ljava/lang/Object;
.source "SKActivityRecognitionManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/SKActivityRecognitionManager;->connectAndStopActivityCallbacks()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/SKActivityRecognitionManager;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager$3;->this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager$3;->this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->access$200(Lcom/shopkick/app/location/SKActivityRecognitionManager;)V

    return-void
.end method
