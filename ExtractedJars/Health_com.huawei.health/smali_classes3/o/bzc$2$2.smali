.class Lo/bzc$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bzc$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bzc$2;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/bzc$2;I)V
    .locals 0

    .line 119
    iput-object p1, p0, Lo/bzc$2$2;->b:Lo/bzc$2;

    iput p2, p0, Lo/bzc$2$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 122
    iget-object v0, p0, Lo/bzc$2$2;->b:Lo/bzc$2;

    iget-object v0, v0, Lo/bzc$2;->e:Lo/bzc;

    iget-object v1, p0, Lo/bzc$2$2;->b:Lo/bzc$2;

    iget-object v1, v1, Lo/bzc$2;->e:Lo/bzc;

    iget v1, v1, Lo/bzc;->g:I

    iget v2, p0, Lo/bzc$2$2;->c:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/bzc;->smoothScrollTo(II)V

    .line 123
    return-void
.end method
