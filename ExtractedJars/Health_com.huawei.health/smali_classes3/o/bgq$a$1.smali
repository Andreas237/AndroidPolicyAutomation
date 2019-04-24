.class Lo/bgq$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgq$a;->c(IIZ)Lo/bgq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bgq$a;

.field final synthetic d:Lo/bgq;


# direct methods
.method constructor <init>(Lo/bgq$a;Lo/bgq;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/bgq$a$1;->b:Lo/bgq$a;

    iput-object p2, p0, Lo/bgq$a$1;->d:Lo/bgq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lo/bgq$a$1;->d:Lo/bgq;

    invoke-virtual {v0}, Lo/bgq;->dismiss()V

    .line 113
    return-void
.end method
