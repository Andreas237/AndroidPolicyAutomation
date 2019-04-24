.class public final enum Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;
.super Ljava/lang/Enum;
.source "FlexibleDividerDecoration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "DividerType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

.field public static final enum COLOR:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

.field public static final enum DRAWABLE:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

.field public static final enum PAINT:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 30
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    const-string v1, "DRAWABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->DRAWABLE:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    const-string v1, "PAINT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->PAINT:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    const-string v1, "COLOR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->COLOR:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    const/4 v0, 0x3

    .line 29
    new-array v0, v0, [Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    sget-object v1, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->DRAWABLE:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->PAINT:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->COLOR:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->$VALUES:[Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;
    .locals 1

    .line 29
    const-class v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    return-object p0
.end method

.method public static values()[Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;
    .locals 1

    .line 29
    sget-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->$VALUES:[Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    invoke-virtual {v0}, [Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    return-object v0
.end method
