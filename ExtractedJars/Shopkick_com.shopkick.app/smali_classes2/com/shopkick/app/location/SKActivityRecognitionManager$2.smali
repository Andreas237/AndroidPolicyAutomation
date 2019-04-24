.class Lcom/shopkick/app/location/SKActivityRecognitionManager$2;
.super Ljava/lang/Object;
.source "SKActivityRecognitionManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/SKActivityRecognitionManager;->connectAndStartActivityCallbacks(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;

.field final synthetic val$updateInterval:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/SKActivityRecognitionManager;I)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager$2;->this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    iput p2, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager$2;->val$updateInterval:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager$2;->this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    iget v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager$2;->val$updateInterval:I

    invoke-static {v0, v1}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->access$100(Lcom/shopkick/app/location/SKActivityRecognitionManager;I)V

    return-void
.end method
