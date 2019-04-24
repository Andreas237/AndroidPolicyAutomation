.class Lo/ery$e$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ery$e;->e(II)Lo/ery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ery;

.field final synthetic e:Lo/ery$e;


# direct methods
.method constructor <init>(Lo/ery$e;Lo/ery;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lo/ery$e$2;->e:Lo/ery$e;

    iput-object p2, p0, Lo/ery$e$2;->d:Lo/ery;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lo/ery$e$2;->d:Lo/ery;

    invoke-virtual {v0}, Lo/ery;->dismiss()V

    .line 108
    return-void
.end method
