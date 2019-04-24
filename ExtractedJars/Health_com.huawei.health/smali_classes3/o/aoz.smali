.class public Lo/aoz;
.super Lo/aoy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aoz$d;
    }
.end annotation


# static fields
.field public static final e:Ljava/util/regex/Pattern;


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-string v0, "(\\+[0-9]+[\\- \\.]*)?(\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.]{3,}[0-9])"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/aoz;->e:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/aoy;-><init>()V

    .line 36
    iput-object p1, p0, Lo/aoz;->c:Ljava/lang/String;

    .line 37
    iput p2, p0, Lo/aoz;->d:I

    .line 38
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 44
    iget-object v0, p0, Lo/aoz;->c:Ljava/lang/String;

    const/16 v1, 0x9

    const/16 v2, 0x7e9

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v0}, Lo/apf;->a(IIILjava/lang/Object;)V

    .line 46
    return-void
.end method
