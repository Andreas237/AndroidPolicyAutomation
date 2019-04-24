.class Lo/cpt$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final b:Lo/cpt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Lo/cpt;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpt;-><init>(Lo/cpt$2;)V

    sput-object v0, Lo/cpt$b;->b:Lo/cpt;

    .line 37
    return-void
.end method
