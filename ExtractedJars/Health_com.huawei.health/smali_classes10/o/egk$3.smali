.class Lo/egk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egm$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egk;


# direct methods
.method constructor <init>(Lo/egk;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/egk$3;->c:Lo/egk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lo/egk$3;->c:Lo/egk;

    invoke-static {v0, p2}, Lo/egk;->a(Lo/egk;I)I

    .line 48
    iget-object v0, p0, Lo/egk$3;->c:Lo/egk;

    invoke-static {v0, p2}, Lo/egk;->b(Lo/egk;I)I

    .line 50
    return-void
.end method
