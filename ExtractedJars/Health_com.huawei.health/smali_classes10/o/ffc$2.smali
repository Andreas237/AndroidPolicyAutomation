.class Lo/ffc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ffc;


# direct methods
.method constructor <init>(Lo/ffc;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lo/ffc$2;->d:Lo/ffc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 190
    iget-object v0, p0, Lo/ffc$2;->d:Lo/ffc;

    add-int/lit8 v1, p2, 0x1

    invoke-static {v0, v1}, Lo/ffc;->b(Lo/ffc;I)I

    .line 191
    iget-object v0, p0, Lo/ffc$2;->d:Lo/ffc;

    invoke-static {v0, p2}, Lo/ffc;->c(Lo/ffc;I)I

    .line 193
    return-void
.end method
