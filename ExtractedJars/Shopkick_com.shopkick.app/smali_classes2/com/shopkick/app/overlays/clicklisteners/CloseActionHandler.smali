.class public Lcom/shopkick/app/overlays/clicklisteners/CloseActionHandler;
.super Ljava/lang/Object;
.source "CloseActionHandler.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/CloseActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 17
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/CloseActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;->dismiss()V

    return-void
.end method
