.class public Lcom/scandit/parser/ParserResult;
.super Ljava/lang/Object;
.source "ParserResult.java"


# instance fields
.field private final mFieldList:[Lcom/scandit/parser/Field;

.field private final mFieldMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/scandit/parser/Field;",
            ">;"
        }
    .end annotation
.end field

.field private final mJson:Ljava/lang/String;


# direct methods
.method constructor <init>([Lcom/scandit/parser/Field;Ljava/util/Map;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/scandit/parser/Field;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/scandit/parser/Field;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/scandit/parser/ParserResult;->mFieldList:[Lcom/scandit/parser/Field;

    .line 14
    iput-object p2, p0, Lcom/scandit/parser/ParserResult;->mFieldMap:Ljava/util/Map;

    .line 15
    iput-object p3, p0, Lcom/scandit/parser/ParserResult;->mJson:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getFieldsArray()[Lcom/scandit/parser/Field;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/scandit/parser/ParserResult;->mFieldList:[Lcom/scandit/parser/Field;

    return-object v0
.end method

.method public getFieldsDict()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/scandit/parser/Field;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/scandit/parser/ParserResult;->mFieldMap:Ljava/util/Map;

    return-object v0
.end method

.method public getJsonString()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/scandit/parser/ParserResult;->mJson:Ljava/lang/String;

    return-object v0
.end method
