.class Lo/epk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fgh$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/epk;


# direct methods
.method constructor <init>(Lo/epk;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/epk$3;->e:Lo/epk;

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

    .line 125
    iget-object v0, p0, Lo/epk$3;->e:Lo/epk;

    const/4 v1, 0x2

    invoke-static {v0, p2, v1}, Lo/epk;->a(Lo/epk;II)V

    .line 126
    return-void
.end method
