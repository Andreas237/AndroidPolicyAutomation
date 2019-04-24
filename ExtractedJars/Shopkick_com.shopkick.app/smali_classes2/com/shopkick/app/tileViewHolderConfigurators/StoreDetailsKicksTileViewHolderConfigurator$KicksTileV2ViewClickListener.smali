.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;
.super Ljava/lang/Object;
.source "StoreDetailsKicksTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "KicksTileV2ViewClickListener"
.end annotation


# instance fields
.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private element:I

.field private sklink:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;Ljava/lang/String;I)V
    .locals 1

    .line 795
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 796
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 797
    iput p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;->element:I

    .line 798
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;->sklink:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 803
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    if-eqz p1, :cond_0

    .line 805
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;->sklink:Ljava/lang/String;

    iget v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;->element:I

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksViewTapped(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method
