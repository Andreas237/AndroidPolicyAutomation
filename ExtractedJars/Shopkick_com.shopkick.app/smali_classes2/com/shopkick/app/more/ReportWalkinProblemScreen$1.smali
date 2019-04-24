.class Lcom/shopkick/app/more/ReportWalkinProblemScreen$1;
.super Ljava/lang/Object;
.source "ReportWalkinProblemScreen.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/more/ReportWalkinProblemScreen;->maybeShowThirdSection()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$1;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p2, 0x1

    .line 190
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 191
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    const/4 p1, 0x0

    return p1
.end method
