.class Lo/cop$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final e:Lo/cop;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 66
    new-instance v0, Lo/cop;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cop;-><init>(Lo/cop$2;)V

    sput-object v0, Lo/cop$a;->e:Lo/cop;

    .line 67
    return-void
.end method
