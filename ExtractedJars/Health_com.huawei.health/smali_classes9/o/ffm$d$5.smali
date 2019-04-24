.class Lo/ffm$d$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffm$d;->b(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ffm$d;


# direct methods
.method constructor <init>(Lo/ffm$d;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lo/ffm$d$5;->b:Lo/ffm$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 188
    iget-object v0, p0, Lo/ffm$d$5;->b:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->i(Lo/ffm$d;)Landroid/widget/ImageView;

    move-result-object v0

    const-string v1, "#000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 189
    return-void
.end method
