.class Lo/epk$2;
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
.field final synthetic c:Lo/epk;


# direct methods
.method constructor <init>(Lo/epk;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/epk$2;->c:Lo/epk;

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

    .line 131
    iget-object v0, p0, Lo/epk$2;->c:Lo/epk;

    invoke-static {v0, p2}, Lo/epk;->c(Lo/epk;I)V

    .line 132
    return-void
.end method
