.class Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;
.super Ljava/lang/Object;
.source "BCRulesScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/BCRulesScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ButtonClickHandler"
.end annotation


# instance fields
.field private buttonType:Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

.field private elementEnum:I

.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/bnc/BCRulesScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/bnc/BCRulesScreen;Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;I)V
    .locals 1

    .line 645
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 646
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;->screenRef:Ljava/lang/ref/WeakReference;

    .line 647
    iput-object p2, p0, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;->buttonType:Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

    .line 648
    iput p3, p0, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;->elementEnum:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 653
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/bnc/BCRulesScreen;

    if-eqz p1, :cond_0

    .line 655
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;->buttonType:Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

    iget v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;->elementEnum:I

    invoke-static {p1, v0, v1}, Lcom/shopkick/app/bnc/BCRulesScreen;->access$200(Lcom/shopkick/app/bnc/BCRulesScreen;Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;I)V

    :cond_0
    return-void
.end method
