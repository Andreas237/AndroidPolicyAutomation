.class Lo/ffo$1;
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
.field final synthetic b:Lo/ffo;


# direct methods
.method constructor <init>(Lo/ffo;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lo/ffo$1;->b:Lo/ffo;

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

    .line 184
    iget-object v0, p0, Lo/ffo$1;->b:Lo/ffo;

    add-int/lit8 v1, p2, 0x1

    invoke-static {v0, v1}, Lo/ffo;->c(Lo/ffo;I)I

    .line 185
    iget-object v0, p0, Lo/ffo$1;->b:Lo/ffo;

    invoke-static {v0, p2}, Lo/ffo;->d(Lo/ffo;I)I

    .line 187
    return-void
.end method
