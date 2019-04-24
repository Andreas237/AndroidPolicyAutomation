.class Lo/ekh$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ekh;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ekh;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/ekh;I)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/ekh$2;->b:Lo/ekh;

    iput p2, p0, Lo/ekh$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 50
    iget-object v0, p0, Lo/ekh$2;->b:Lo/ekh;

    iget v1, p0, Lo/ekh$2;->c:I

    invoke-virtual {v0, v1}, Lo/ekh;->b(I)V

    .line 51
    return-void
.end method
