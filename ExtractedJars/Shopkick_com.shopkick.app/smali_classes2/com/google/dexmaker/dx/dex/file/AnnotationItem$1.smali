.class synthetic Lcom/google/dexmaker/dx/dex/file/AnnotationItem$1;
.super Ljava/lang/Object;
.source "AnnotationItem.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/file/AnnotationItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 196
    invoke-static {}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->values()[Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem$1;->$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility:[I

    :try_start_0
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem$1;->$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility:[I

    sget-object v1, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->BUILD:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem$1;->$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility:[I

    sget-object v1, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationItem$1;->$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility:[I

    sget-object v1, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
