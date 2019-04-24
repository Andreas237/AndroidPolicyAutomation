.class Lcom/squareup/leakcanary/internal/DisplayLeakActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/internal/DisplayLeakActivity;->updateUi()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/leakcanary/internal/DisplayLeakActivity;

.field final synthetic val$adapter:Lcom/squareup/leakcanary/internal/DisplayLeakAdapter;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/internal/DisplayLeakActivity;Lcom/squareup/leakcanary/internal/DisplayLeakAdapter;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$4;->this$0:Lcom/squareup/leakcanary/internal/DisplayLeakActivity;

    iput-object p2, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$4;->val$adapter:Lcom/squareup/leakcanary/internal/DisplayLeakAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 295
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$4;->val$adapter:Lcom/squareup/leakcanary/internal/DisplayLeakAdapter;

    invoke-virtual {v0, p3}, Lcom/squareup/leakcanary/internal/DisplayLeakAdapter;->toggleRow(I)V

    .line 296
    return-void
.end method
