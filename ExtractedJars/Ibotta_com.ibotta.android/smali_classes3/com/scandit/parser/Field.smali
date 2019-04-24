.class public Lcom/scandit/parser/Field;
.super Ljava/lang/Object;
.source "Field.java"


# instance fields
.field private final mName:Ljava/lang/String;

.field private final mParsed:Ljava/lang/Object;

.field private final mRawString:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/scandit/parser/Field;->mName:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/scandit/parser/Field;->mRawString:Ljava/lang/String;

    .line 18
    iput-object p3, p0, Lcom/scandit/parser/Field;->mParsed:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/scandit/parser/Field;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public getParsed()Ljava/lang/Object;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/scandit/parser/Field;->mParsed:Ljava/lang/Object;

    return-object v0
.end method

.method public getRawString()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/scandit/parser/Field;->mRawString:Ljava/lang/String;

    return-object v0
.end method
