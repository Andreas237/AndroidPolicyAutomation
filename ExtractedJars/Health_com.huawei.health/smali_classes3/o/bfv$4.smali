.class Lo/bfv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfv;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bfv;


# direct methods
.method constructor <init>(Lo/bfv;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lo/bfv$4;->b:Lo/bfv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 284
    iget-object v0, p0, Lo/bfv$4;->b:Lo/bfv;

    invoke-static {v0}, Lo/bfv;->d(Lo/bfv;)V

    .line 285
    return-void
.end method
