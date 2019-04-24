.class Lcom/shopkick/app/store/MCommerceManager$4;
.super Ljava/lang/Object;
.source "MCommerceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/MCommerceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/MCommerceManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/MCommerceManager;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$4;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$4;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/store/MCommerceManager;->dismissOverlay()V

    return-void
.end method
