.class Lo/aeu$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aeu$2;->onStatusChanged(Lo/acl;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/acl;

.field final synthetic b:Lo/aeu$2;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/aeu$2;Lo/acl;I)V
    .locals 0

    .line 302
    iput-object p1, p0, Lo/aeu$2$1;->b:Lo/aeu$2;

    iput-object p2, p0, Lo/aeu$2$1;->a:Lo/acl;

    iput p3, p0, Lo/aeu$2$1;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 305
    iget-object v0, p0, Lo/aeu$2$1;->b:Lo/aeu$2;

    iget-object v0, v0, Lo/aeu$2;->a:Lo/aeu;

    iget-object v1, p0, Lo/aeu$2$1;->a:Lo/acl;

    iget v2, p0, Lo/aeu$2$1;->c:I

    invoke-virtual {v0, v1, v2}, Lo/aeu;->a(Lo/acl;I)V

    .line 306
    return-void
.end method
