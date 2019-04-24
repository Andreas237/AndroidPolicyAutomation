.class Lo/egk$1;
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
.field final synthetic e:Lo/egk;


# direct methods
.method constructor <init>(Lo/egk;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/egk$1;->e:Lo/egk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lo/egk$1;->e:Lo/egk;

    invoke-static {v0, p2}, Lo/egk;->e(Lo/egk;I)I

    .line 39
    iget-object v0, p0, Lo/egk$1;->e:Lo/egk;

    add-int/lit8 v1, p2, 0x1

    invoke-static {v0, v1}, Lo/egk;->d(Lo/egk;I)I

    .line 42
    return-void
.end method
