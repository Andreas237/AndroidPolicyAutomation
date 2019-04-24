.class Lo/fgi$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fgh$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fgi;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fgi;


# direct methods
.method constructor <init>(Lo/fgi;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lo/fgi$3;->c:Lo/fgi;

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

    .line 185
    iget-object v0, p0, Lo/fgi$3;->c:Lo/fgi;

    add-int/lit8 v1, p2, 0x1

    invoke-static {v0, v1}, Lo/fgi;->c(Lo/fgi;I)I

    .line 186
    iget-object v0, p0, Lo/fgi$3;->c:Lo/fgi;

    invoke-static {v0, p2}, Lo/fgi;->e(Lo/fgi;I)I

    .line 188
    return-void
.end method
