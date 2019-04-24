.class Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$3;
.super Ljava/lang/Object;
.source "SearchBar.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;-><init>(Landroid/content/Context;Landroid/view/View$OnClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$3;->this$0:Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 97
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/16 p2, 0x42

    if-ne p1, p2, :cond_0

    .line 98
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 99
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$3;->this$0:Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->access$000(Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;)V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
