.class Lo/egi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egm$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egi;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egi;


# direct methods
.method constructor <init>(Lo/egi;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lo/egi$2;->c:Lo/egi;

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

    .line 176
    iget-object v0, p0, Lo/egi$2;->c:Lo/egi;

    invoke-static {v0, p2}, Lo/egi;->d(Lo/egi;I)V

    .line 177
    return-void
.end method