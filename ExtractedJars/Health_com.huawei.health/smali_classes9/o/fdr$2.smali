.class final Lo/fdr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdr;->e(Landroid/view/View;ZLo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic d:Lo/acu;


# direct methods
.method constructor <init>(Lo/acu;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lo/fdr$2;->d:Lo/acu;

    iput-object p2, p0, Lo/fdr$2;->a:Landroid/widget/ImageView;

    iput-object p3, p0, Lo/fdr$2;->c:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 162
    iget-object v0, p0, Lo/fdr$2;->d:Lo/acu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/acu;->e(B)V

    .line 163
    iget-object v0, p0, Lo/fdr$2;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fdr$2;->c:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/fdr;->a(ZLandroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 164
    return-void
.end method
