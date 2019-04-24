.class Lo/ffo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ffo;


# direct methods
.method constructor <init>(Lo/ffo;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lo/ffo$5;->c:Lo/ffo;

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

    .line 172
    iget-object v0, p0, Lo/ffo$5;->c:Lo/ffo;

    invoke-static {v0, p2}, Lo/ffo;->a(Lo/ffo;I)V

    .line 173
    return-void
.end method
