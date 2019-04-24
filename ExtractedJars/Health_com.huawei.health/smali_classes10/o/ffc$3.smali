.class Lo/ffc$3;
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
.field final synthetic e:Lo/ffc;


# direct methods
.method constructor <init>(Lo/ffc;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lo/ffc$3;->e:Lo/ffc;

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

    .line 178
    iget-object v0, p0, Lo/ffc$3;->e:Lo/ffc;

    invoke-static {v0, p2}, Lo/ffc;->d(Lo/ffc;I)V

    .line 179
    return-void
.end method
