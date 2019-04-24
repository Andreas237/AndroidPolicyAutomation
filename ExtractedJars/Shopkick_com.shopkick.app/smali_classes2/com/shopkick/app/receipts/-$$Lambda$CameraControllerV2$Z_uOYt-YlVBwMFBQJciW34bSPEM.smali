.class public final synthetic Lcom/shopkick/app/receipts/-$$Lambda$CameraControllerV2$Z_uOYt-YlVBwMFBQJciW34bSPEM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/receipts/CameraControllerV2;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/-$$Lambda$CameraControllerV2$Z_uOYt-YlVBwMFBQJciW34bSPEM;->f$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/receipts/-$$Lambda$CameraControllerV2$Z_uOYt-YlVBwMFBQJciW34bSPEM;->f$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->lambda$closeCamera$207(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    return-void
.end method
