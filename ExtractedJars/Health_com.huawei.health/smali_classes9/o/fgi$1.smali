.class Lo/fgi$1;
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
.field final synthetic b:Lo/fgi;


# direct methods
.method constructor <init>(Lo/fgi;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lo/fgi$1;->b:Lo/fgi;

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

    .line 173
    iget-object v0, p0, Lo/fgi$1;->b:Lo/fgi;

    invoke-static {v0, p2}, Lo/fgi;->b(Lo/fgi;I)V

    .line 174
    return-void
.end method
