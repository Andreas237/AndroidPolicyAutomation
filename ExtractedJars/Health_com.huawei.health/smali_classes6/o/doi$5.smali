.class Lo/doi$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/doi;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/doi;


# direct methods
.method constructor <init>(Lo/doi;I)V
    .locals 0

    .line 48
    iput-object p1, p0, Lo/doi$5;->b:Lo/doi;

    iput p2, p0, Lo/doi$5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 51
    iget-object v0, p0, Lo/doi$5;->b:Lo/doi;

    iget v1, p0, Lo/doi$5;->a:I

    invoke-virtual {v0, v1}, Lo/doi;->a(I)V

    .line 52
    return-void
.end method
