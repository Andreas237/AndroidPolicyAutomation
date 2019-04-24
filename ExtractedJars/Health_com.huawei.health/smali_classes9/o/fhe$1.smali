.class Lo/fhe$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhe;->b(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fhe;

.field final synthetic c:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lo/fhe;Landroid/app/Activity;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lo/fhe$1;->a:Lo/fhe;

    iput-object p2, p0, Lo/fhe$1;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 132
    iget-object v0, p0, Lo/fhe$1;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 133
    return-void
.end method
