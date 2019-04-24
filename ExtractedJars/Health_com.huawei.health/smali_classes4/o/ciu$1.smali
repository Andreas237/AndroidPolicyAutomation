.class Lo/ciu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/enj$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ciu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ciu;


# direct methods
.method constructor <init>(Lo/ciu;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/ciu$1;->c:Lo/ciu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lo/ciu$1;->c:Lo/ciu;

    invoke-static {v0, p2}, Lo/ciu;->b(Lo/ciu;I)I

    .line 35
    return-void
.end method
