.class public Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;
.super Ljava/lang/Object;
.source "ScanScreen.java"

# interfaces
.implements Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;
.implements Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;
.implements Lcom/shopkick/app/products/scanning/interfaces/ScanIRListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ScanScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ScanningRequestListener"
.end annotation


# instance fields
.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/products/ScanScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/products/ScanScreen;",
            ">;)V"
        }
    .end annotation

    .line 1478
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1479
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;->screenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public tryInitializeCamera()V
    .locals 2

    .line 1484
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v0, :cond_0

    .line 1486
    sget-object v1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/screens/AppScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    :cond_0
    return-void
.end method

.method public tryRequestValidateBC(Ljava/lang/String;[B)V
    .locals 1

    .line 1492
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/products/ScanScreen;

    if-eqz v0, :cond_0

    .line 1494
    invoke-static {v0, p1, p2}, Lcom/shopkick/app/products/ScanScreen;->access$1100(Lcom/shopkick/app/products/ScanScreen;Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method public tryRequestValidateIR(I[B)V
    .locals 1

    .line 1500
    iget-object v0, p0, Lcom/shopkick/app/products/ScanScreen$ScanningRequestListener;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/products/ScanScreen;

    if-eqz v0, :cond_0

    .line 1502
    invoke-static {v0, p1, p2}, Lcom/shopkick/app/products/ScanScreen;->access$1200(Lcom/shopkick/app/products/ScanScreen;I[B)V

    :cond_0
    return-void
.end method
